package com.spw.impl;

import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcController;
import com.google.protobuf.ServiceException;
import com.spw.proto.HelloRequest;
import com.spw.proto.HelloResponse;
import com.spw.proto.HelloService;
import com.spw.proto.HelloServiceGrpc;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * @author sunpengwei
 * @description TODO
 * @date 2019/11/19 21:04
 */
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
    /**
     * <pre>
     *一个简单的rpc
     * </pre>
     */
    @Override
    public void helloWorld(HelloRequest request,
                           io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {

        System.out.println(request.getRequest());
        responseObserver.onNext(HelloResponse.newBuilder().setResponse("hello my is java server").build());
        responseObserver.onCompleted();
    }
}
