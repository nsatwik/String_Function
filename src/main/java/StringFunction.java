package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class StringFunction implements RequestHandler<Request, Response> {

    @Override
    public Response handleRequest(Request request, Context context) {
        String uppercasedString = request.getInputString().toUpperCase();
        return new Response(uppercasedString);
    }
}
