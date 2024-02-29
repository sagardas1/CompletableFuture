package com.completableFuture.CompletableFuture.async;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * Created by sagardas on 29/02/24.
 */
public class MyCompletableFuture1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture=computeAsync();
        System.out.println( completableFuture.get());

    }

    private static CompletableFuture<String> computeAsync() {

        String[] str={"HR","MBA","SDE"};
CompletableFuture<String> completableFuture=new CompletableFuture<>();
        ExecutorService executorService= Executors.newFixedThreadPool(8);

        executorService.submit(()->{

                    String name= Arrays.stream(str).collect(Collectors.joining(",","[","]"));
      //completableFuture.complete(name);
            /**
             * if we are not getting result.
             */
      completableFuture.cancel(true);
      return null;

        });
        return completableFuture;
    }
}
