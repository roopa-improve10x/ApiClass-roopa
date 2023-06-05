package com.example.modelclassapi;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.modelclassapi.models.Shop;
import com.example.modelclassapi.network.ModelApi;
import com.example.modelclassapi.network.ModelApiService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void fetchData() throws IOException {
        ModelApiService service = new ModelApi().createModelApiService();
        Call<List<Shop>> call = service.fetchData();
        List<Shop> shops = call.execute().body();
        assertNotNull(shops);
        assertFalse(shops.isEmpty());
        System.out.println(new Gson().toJson(shops));
    }
}