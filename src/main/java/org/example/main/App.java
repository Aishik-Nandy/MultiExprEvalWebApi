package org.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App 
{
    // Let’s assume that the API only supports 50 requests per second per
    // client whereas your application is expected to evaluate at
    // least 500 expressions per second
    private static final int NUM_WORKER_THREADS = 10;
    private static final int MAX_QUEUE_SIZE = 1000;

    public static void main(String[] args )
    {

        BlockingQueue<String> expressionQueue
                = new ArrayBlockingQueue<>(MAX_QUEUE_SIZE);
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_WORKER_THREADS);

        
    }
}
