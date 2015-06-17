// Generated code from Butter Knife. Do not modify!
package com.example.butterknifeexamples;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class FancyFragment$$ViewInjector<T extends com.example.butterknifeexamples.FancyFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230722, "field 'button1' and method 'sayHi'");
    target.button1 = finder.castView(view, 2131230722, "field 'button1'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.sayHi(finder.<android.widget.Button>castParam(p0, "doClick", 0, "sayHi", 0));
        }
      });
    view = finder.findRequiredView(source, 2131230720, "field 'et'");
    target.et = finder.castView(view, 2131230720, "field 'et'");
    view = finder.findRequiredView(source, 2131230724, "field 'button2' and method 'sayBye'");
    target.button2 = finder.castView(view, 2131230724, "field 'button2'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.sayBye(finder.<android.widget.Button>castParam(p0, "doClick", 0, "sayBye", 0));
        }
      });
    target.nameViews = Finder.listOf(
        finder.<android.widget.EditText>findRequiredView(source, 2131230725, "field 'nameViews'"),
        finder.<android.widget.EditText>findRequiredView(source, 2131230726, "field 'nameViews'"),
        finder.<android.widget.EditText>findRequiredView(source, 2131230727, "field 'nameViews'")
    );
  }

  @Override public void reset(T target) {
    target.button1 = null;
    target.et = null;
    target.button2 = null;
    target.nameViews = null;
  }
}
