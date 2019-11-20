package com.spw;

import com.google.protobuf.ByteString;
import com.spw.proto.HelloRequest;
import com.spw.proto.HelloResponse;
import com.spw.proto.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NegotiationType;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;

/**
 * @author sunpengwei
 * @description
 * @date 2019/11/16 18:33
 */
public class MainClient {

    public static void main(String[] args) {
        //通过netty创建通道
        ManagedChannel channel = NettyChannelBuilder.forAddress("127.0.0.1", 8090)
                .negotiationType(NegotiationType.PLAINTEXT)
                .build();
        //获取客户端存根对象
        HelloServiceGrpc.HelloServiceBlockingStub blockingStub = HelloServiceGrpc.newBlockingStub(channel);
        //创建入参
        HelloRequest helloRequest = HelloRequest.newBuilder().setRequestBytes(ByteString.copyFromUtf8("hello grpc")).build();
        //调用服务端
        HelloResponse helloResponse = blockingStub.helloWorld(helloRequest);
        //打印响应
        System.out.println(helloResponse.getResponse());
    }
}
