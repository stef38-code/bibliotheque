package org.hussard.code.web.rest.client;

import okhttp3.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

class MyOkHttpClientTest {
    private static final Logger log = getLogger(MyOkHttpClientTest.class);

    @Test
 void first(){
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        String s = null;
        RequestBody body = RequestBody.create(mediaType, "");

        Request request = new Request.Builder()
                .url("https://pokeapi.co/api/v2/pokemon/ditto/")
                .method("GET",body)
                .build();
        try (Response response = client.newCall(request).execute()){
            assertThat(response.isSuccessful()).isTrue()   ;
            log.info(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
