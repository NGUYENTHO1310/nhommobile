package com.example.nhommobile.retrofit;

import com.example.nhommobile.model.LoaiXeModel;
import com.example.nhommobile.model.SanPhamMoiModel;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface ApiBanHang {
    @GET("layloaisp.php")
    Observable<LoaiXeModel> getLoaiSp();

    @GET("getspmoi.php")
    Observable<SanPhamMoiModel> getSpMoi();
}
