package botmerc.verify;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws UnirestException {
		HttpResponse<String> response = Unirest.post("http://www.ragnaxp.com/Market/Search")
				.header("content-type", "multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW")
				.body("------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"item_id\"\r\n\r\n\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"nm_item\"\r\n\r\nBoa Ventura\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--")
				.asString();
	}
}
