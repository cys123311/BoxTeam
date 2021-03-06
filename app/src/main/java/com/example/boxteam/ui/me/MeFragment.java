package com.example.boxteam.ui.me;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.boxteam.R;
import com.example.boxteam.base.BaseFragment;
import com.example.boxteam.base.BasePresenter;
import com.example.boxteam.bigboss.jf.JfActivity;
import com.example.boxteam.bigboss.parent.ParentActivity;
import com.example.boxteam.cysboss.DiscountActivity;
import com.example.boxteam.cysboss.LogisticsActivity;
import com.example.boxteam.cysboss.ScheduleActivity;
import com.example.boxteam.cysboss.TaskActivity;
import com.example.boxteam.lc.CustomActivity;
import com.example.boxteam.lc.UserInfoActivity;
import com.example.boxteam.wsqboss.home.main.CollectActivity;
import com.example.boxteam.wsqboss.home.main.HotActivity;
import com.example.boxteam.wsqboss.home.main.SetActivity;

import butterknife.BindView;
import butterknife.OnClick;


public class MeFragment extends BaseFragment {


    @BindView(R.id.img_do)
    ImageView imgDo;
    @BindView(R.id.txt_name)
    TextView txtName;
    @BindView(R.id.img_header)
    ImageView imgHeader;
    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.collect)
    RelativeLayout collect;
    @BindView(R.id.set)
    RelativeLayout set;
    @BindView(R.id.layout_zuoye)
    RelativeLayout layoutZuoye;
    @BindView(R.id.layout_jiazhang)
    RelativeLayout layoutJiazhang;
    @BindView(R.id.layout_kefu)
    RelativeLayout layoutKefu;
    @BindView(R.id.layout_youhui)
    RelativeLayout layoutYouhui;
    @BindView(R.id.kecheng)
    RelativeLayout kecheng;
    @BindView(R.id.jifen)
    Button jifen;
    @BindView(R.id.layout_dingban)
    RelativeLayout layoutDingban;
    @BindView(R.id.rl_me_hd)
    RelativeLayout rlMeHd;


    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        Glide.with( getActivity() ).load( R.mipmap.jifeng_me_beijing ).apply( new RequestOptions().transform( new RoundedCorners( 20 ) ) ).into( imgBack );
        Glide.with( getActivity() ).load( R.mipmap.header ).apply( new RequestOptions().transform( new RoundedCorners( 50 ) ) ).into( imgHeader );

    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_me;
    }


    @OnClick({R.id.collect, R.id.set, R.id.layout_zuoye
            , R.id.layout_jiazhang, R.id.layout_kefu,
            R.id.layout_youhui, R.id.img_header, R.id.kecheng
            , R.id.jifen, R.id.layout_dingban,R.id.rl_me_hd})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.collect:
                startActivity( new Intent( getActivity(), CollectActivity.class ) );
                break;
            case R.id.set:
                startActivity( new Intent( getActivity(), SetActivity.class ) );
                break;
            case R.id.layout_zuoye:
                startActivity( new Intent( getActivity(), TaskActivity.class ) );
                break;
            case R.id.layout_jiazhang:
                startActivity( new Intent( getActivity(), ParentActivity.class ) );
                break;
            case R.id.layout_kefu:
                startActivity( new Intent( getActivity(), CustomActivity.class ) );
                break;
            case R.id.layout_youhui:
                startActivity( new Intent( getActivity(), DiscountActivity.class ) );
                break;
            case R.id.img_header:
                startActivity( new Intent( getActivity(), UserInfoActivity.class ) );
                break;
            case R.id.kecheng:
                startActivity( new Intent( getActivity(), ScheduleActivity.class ) );
                break;
            case R.id.jifen:
                startActivity( new Intent( getActivity(), JfActivity.class ) );
                break;
            case R.id.layout_dingban:
                startActivity( new Intent( getActivity(), LogisticsActivity.class ) );
                break;
            case R.id.rl_me_hd:
                startActivity( new Intent( getActivity(), HotActivity.class ) );
                break;
        }
    }

}