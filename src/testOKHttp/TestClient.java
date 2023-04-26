package testOKHttp;

import java.io.IOException;

import com.google.gson.Gson;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TestClient {
	
	public static void main(String[] args) {
		System.out.println("AA");
	}
	
	// create client
	OkHttpClient client = new OkHttpClient().newBuilder().build();	
	// set request url
	Request request = new Request.Builder()
			         .url("https://jsonplaceholder.typicode.com/posts/1").build();
	public static final MediaType type = MediaType.parse("application/json; charset=utf-8");
	
	// POST
	String post(String url, String json) throws IOException {
		Gson gson = new Gson();
	    RequestBody body = RequestBody.create("", type);
	    Request request = new Request.Builder()
	      .url(url)
	      .post(body)
	      .build();
	    Response response = client.newCall(request).execute();
	    if (response.isSuccessful()) {
	        return response.body().string();
	    } else {
	        throw new IOException("Unexpected code " + response);
	    }
	}
	
	
	// create default call
	public void DoClient() {
		Call call = client.newCall(request);
		call.enqueue(new Callback() {
			@Override
			public void onResponse(Call call, Response res) throws IOException {
				String result = res.body().string();
				TestPOJO resmodel = new Gson().fromJson(result, TestPOJO.class);
				
				System.out.println(result);
			}
			
			@Override
			public void onFailure(Call call, IOException e) {
				e.printStackTrace();
				System.out.println("DO ERROR");				
			}
		});
	}
	
	
}
