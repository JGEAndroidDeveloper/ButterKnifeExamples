// Generated code from Butter Knife. Do not modify!
package com.example.butterknifeexamples;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends com.example.butterknifeexamples.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230722, "field 'b', method 'button1', and method 'sayHi'");
    target.b = finder.castView(view, 2131230722, "field 'b'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.button1();
          target.sayHi(finder.<android.widget.Button>castParam(p0, "doClick", 0, "sayHi", 0));
        }
      });
    view = finder.findRequiredView(source, 2131230721, "field 'tv'");
    target.tv = finder.castView(view, 2131230721, "field 'tv'");
  }

  @Override public void reset(T target) {
    target.b = null;
    target.tv = null;
  }
}
