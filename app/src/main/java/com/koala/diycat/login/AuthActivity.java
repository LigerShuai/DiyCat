package com.koala.diycat.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.Toast;

import com.koala.diycat.R;
import com.koala.diycat.base.BaseActivity;
import com.koala.diycat.main.home.MainActivity;
import com.sina.weibo.sdk.auth.AccessTokenKeeper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.auth.WbConnectErrorMessage;
import com.sina.weibo.sdk.auth.sso.SsoHandler;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author Liger
 * @date 2018/5/27 00:10
 */

public class AuthActivity extends BaseActivity {

    @BindView(R.id.activity_oauth_login_tv)
    TextView mLoginTv;

    @BindView(R.id.activity_oauth_exit_tv)
    TextView mExitTv;

    @BindView(R.id.activity_oauth_refresh_token_tv)
    TextView mRefreshTokenTv;

    private SsoHandler mSsoHandler;
    private Oauth2AccessToken mAccessToken;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {
        mLoginTv.setMovementMethod(new ScrollingMovementMethod());
        mSsoHandler = new SsoHandler(AuthActivity.this);
        // 从 SharedPreferences 中读取上次已保存好 AccessToken 等信息，
        // 第一次启动本应用，AccessToken 不可用
        mAccessToken = AccessTokenKeeper.readAccessToken(this);
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_auth;
    }

    @OnClick(R.id.activity_oauth_login_tv)
    public void auth() {
        mSsoHandler.authorizeWeb(new SelfWbAuthListener());
    }

    @OnClick(R.id.activity_oauth_exit_tv)
    public void exit() {
        AccessTokenKeeper.clear(getApplicationContext());
        mAccessToken = new Oauth2AccessToken();
    }

    @OnClick(R.id.activity_oauth_refresh_token_tv)
    public void refreshToken() {
        /*if (!TextUtils.isEmpty(mAccessToken.getRefreshToken())) {
            AccessTokenKeeper.refreshToken(WeiboConstants.APP_KEY, AuthActivity.this, new RequestListener() {
                @Override
                public void onComplete(String response) {

                }

                @Override
                public void onWeiboException(WeiboException e) {

                }
            });
        }*/
    }


    /**
     * 当 SSO 授权 Activity 退出时，该函数被调用。
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // SSO 授权回调
        // 重要：发起 SSO 登陆的 Activity 必须重写 onActivityResults
        if (mSsoHandler != null) {
            mSsoHandler.authorizeCallBack(requestCode, resultCode, data);
        }
    }

    private class SelfWbAuthListener implements WbAuthListener {
        @Override
        public void onSuccess(final Oauth2AccessToken token) {
            AuthActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    mAccessToken = token;
                    if (mAccessToken.isSessionValid()) {
                        // 保存 Token 到 SharedPreferences
                        AccessTokenKeeper.writeAccessToken(AuthActivity.this, mAccessToken);
                        Toast.makeText(AuthActivity.this, "授权成功", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(AuthActivity.this, MainActivity.class));
                        finish();
                    }
                }
            });
        }

        @Override
        public void cancel() {
            Toast.makeText(AuthActivity.this, "取消", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onFailure(WbConnectErrorMessage errorMessage) {
            Toast.makeText(AuthActivity.this, errorMessage.getErrorMessage(), Toast.LENGTH_LONG).show();
        }
    }
}