package leoprok.me.svetcakes.factories;

import android.content.Context;
import android.webkit.WebView;

import leoprok.me.svetcakes.R;
import leoprok.me.svetcakes.interfaces.FactoryInterface;

/**
 * Load website to web view
 */
public class WebLoader implements FactoryInterface {

    private WebView mWebView;
    private Context mContext;

    public WebLoader (WebView webView, Context context){
        mWebView = webView;
        mContext = context;
    }

    @Override
    public Object doTask() {
        //enabled javascript
        mWebView.getSettings().setJavaScriptEnabled(true);
        //loads the url from string xml
        mWebView.loadUrl(mContext.getString(R.string.web_site));
        return null;
    }
}
