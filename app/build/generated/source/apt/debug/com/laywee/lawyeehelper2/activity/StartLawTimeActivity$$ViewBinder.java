// Generated code from Butter Knife. Do not modify!
package com.laywee.lawyeehelper2.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class StartLawTimeActivity$$ViewBinder<T extends com.laywee.lawyeehelper2.activity.StartLawTimeActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689661, "field 'mToolbarTitle'");
    target.mToolbarTitle = finder.castView(view, 2131689661, "field 'mToolbarTitle'");
    view = finder.findRequiredView(source, 2131689660, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131689660, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131689617, "field 'mEtNoticeDay'");
    target.mEtNoticeDay = finder.castView(view, 2131689617, "field 'mEtNoticeDay'");
    view = finder.findRequiredView(source, 2131689618, "field 'mEtProofDay'");
    target.mEtProofDay = finder.castView(view, 2131689618, "field 'mEtProofDay'");
    view = finder.findRequiredView(source, 2131689619, "field 'mTvNoticePeriodStart'");
    target.mTvNoticePeriodStart = finder.castView(view, 2131689619, "field 'mTvNoticePeriodStart'");
    view = finder.findRequiredView(source, 2131689620, "field 'mTvNoticePeriodEnd'");
    target.mTvNoticePeriodEnd = finder.castView(view, 2131689620, "field 'mTvNoticePeriodEnd'");
    view = finder.findRequiredView(source, 2131689622, "field 'mTvReplyDay'");
    target.mTvReplyDay = finder.castView(view, 2131689622, "field 'mTvReplyDay'");
    view = finder.findRequiredView(source, 2131689624, "field 'mTvReplyStart'");
    target.mTvReplyStart = finder.castView(view, 2131689624, "field 'mTvReplyStart'");
    view = finder.findRequiredView(source, 2131689625, "field 'mTvReplyEnd'");
    target.mTvReplyEnd = finder.castView(view, 2131689625, "field 'mTvReplyEnd'");
    view = finder.findRequiredView(source, 2131689626, "field 'mTvProofDeadlineStart'");
    target.mTvProofDeadlineStart = finder.castView(view, 2131689626, "field 'mTvProofDeadlineStart'");
    view = finder.findRequiredView(source, 2131689627, "field 'mTvProofDeadlineEnd'");
    target.mTvProofDeadlineEnd = finder.castView(view, 2131689627, "field 'mTvProofDeadlineEnd'");
    view = finder.findRequiredView(source, 2131689628, "field 'mTvLawfulDay'");
    target.mTvLawfulDay = finder.castView(view, 2131689628, "field 'mTvLawfulDay'");
    view = finder.findRequiredView(source, 2131689616, "field 'mTvNotice' and method 'OnClick'");
    target.mTvNotice = finder.castView(view, 2131689616, "field 'mTvNotice'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.OnClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689621, "field 'mTvNoticeSendDay'");
    target.mTvNoticeSendDay = finder.castView(view, 2131689621, "field 'mTvNoticeSendDay'");
    view = finder.findRequiredView(source, 2131689623, "field 'mCbAboutOut'");
    target.mCbAboutOut = finder.castView(view, 2131689623, "field 'mCbAboutOut'");
  }

  @Override public void unbind(T target) {
    target.mToolbarTitle = null;
    target.mToolbar = null;
    target.mEtNoticeDay = null;
    target.mEtProofDay = null;
    target.mTvNoticePeriodStart = null;
    target.mTvNoticePeriodEnd = null;
    target.mTvReplyDay = null;
    target.mTvReplyStart = null;
    target.mTvReplyEnd = null;
    target.mTvProofDeadlineStart = null;
    target.mTvProofDeadlineEnd = null;
    target.mTvLawfulDay = null;
    target.mTvNotice = null;
    target.mTvNoticeSendDay = null;
    target.mCbAboutOut = null;
  }
}
