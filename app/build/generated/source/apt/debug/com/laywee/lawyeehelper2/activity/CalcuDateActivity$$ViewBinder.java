// Generated code from Butter Knife. Do not modify!
package com.laywee.lawyeehelper2.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CalcuDateActivity$$ViewBinder<T extends com.laywee.lawyeehelper2.activity.CalcuDateActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689661, "field 'mToolbarTitle'");
    target.mToolbarTitle = finder.castView(view, 2131689661, "field 'mToolbarTitle'");
    view = finder.findRequiredView(source, 2131689660, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131689660, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131689592, "field 'mRbNormal'");
    target.mRbNormal = finder.castView(view, 2131689592, "field 'mRbNormal'");
    view = finder.findRequiredView(source, 2131689593, "field 'mRbWorkday'");
    target.mRbWorkday = finder.castView(view, 2131689593, "field 'mRbWorkday'");
    view = finder.findRequiredView(source, 2131689591, "field 'mRgConvert'");
    target.mRgConvert = finder.castView(view, 2131689591, "field 'mRgConvert'");
    view = finder.findRequiredView(source, 2131689594, "field 'mTvStart' and method 'OnClick'");
    target.mTvStart = finder.castView(view, 2131689594, "field 'mTvStart'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.OnClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689595, "field 'mDeviler1'");
    target.mDeviler1 = view;
    view = finder.findRequiredView(source, 2131689597, "field 'mEtMonthNum'");
    target.mEtMonthNum = finder.castView(view, 2131689597, "field 'mEtMonthNum'");
    view = finder.findRequiredView(source, 2131689596, "field 'mLlMonth'");
    target.mLlMonth = finder.castView(view, 2131689596, "field 'mLlMonth'");
    view = finder.findRequiredView(source, 2131689598, "field 'mEtDayNum'");
    target.mEtDayNum = finder.castView(view, 2131689598, "field 'mEtDayNum'");
    view = finder.findRequiredView(source, 2131689601, "field 'mTvEnd'");
    target.mTvEnd = finder.castView(view, 2131689601, "field 'mTvEnd'");
  }

  @Override public void unbind(T target) {
    target.mToolbarTitle = null;
    target.mToolbar = null;
    target.mRbNormal = null;
    target.mRbWorkday = null;
    target.mRgConvert = null;
    target.mTvStart = null;
    target.mDeviler1 = null;
    target.mEtMonthNum = null;
    target.mLlMonth = null;
    target.mEtDayNum = null;
    target.mTvEnd = null;
  }
}
