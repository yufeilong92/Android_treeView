// Generated code from Butter Knife. Do not modify!
package com.laywee.lawyeehelper2.activity.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainFragment$$ViewBinder<T extends com.laywee.lawyeehelper2.activity.fragment.MainFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689653, "field 'mIvQuikeCheck'");
    target.mIvQuikeCheck = finder.castView(view, 2131689653, "field 'mIvQuikeCheck'");
    view = finder.findRequiredView(source, 2131689654, "field 'mIvKlCheck'");
    target.mIvKlCheck = finder.castView(view, 2131689654, "field 'mIvKlCheck'");
    view = finder.findRequiredView(source, 2131689655, "field 'mIvPracticeSkill'");
    target.mIvPracticeSkill = finder.castView(view, 2131689655, "field 'mIvPracticeSkill'");
    view = finder.findRequiredView(source, 2131689656, "field 'mIvPracticeTool' and method 'onClick'");
    target.mIvPracticeTool = finder.castView(view, 2131689656, "field 'mIvPracticeTool'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.mIvQuikeCheck = null;
    target.mIvKlCheck = null;
    target.mIvPracticeSkill = null;
    target.mIvPracticeTool = null;
  }
}
