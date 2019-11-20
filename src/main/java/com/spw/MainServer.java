package com.spw;

import com.spw.impl.HelloServiceImpl;
import com.spw.proto.HelloRequest;
import com.spw.proto.HelloResponse;
import com.spw.proto.HelloServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author sunpengwei
 * @description TODO
 * @date 2019/11/19 20:56
 */
public class MainServer {

    public static void main(String[] args) {
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            //启动服务端
            Server server = ServerBuilder.forPort(8090).addService(new HelloServiceImpl()).build().start();

            countDownLatch.await();
        } catch (IOException e) {

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
