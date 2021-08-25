package pkg01;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "{\"DATA\" : {\"ONE\" : 1, \"TWO\" : 2, \"THREE\" : 3}}";
		String data2 = "{\"DATA2\" : {\"ONE\" : 1, \"TWO\" : 2, \"THREE\" : 3}}";
		Gson gson = new Gson();
		Map map = gson.fromJson(data, Map.class);

		System.out.println("aaa = " + map);

		JsonParser parser = new JsonParser();
		JsonObject object = (JsonObject) parser.parse(data);
		JsonObject object2 = (JsonObject) parser.parse(data2);

		System.out.println(" object = " + object);

		object.addProperty("FOUR", 4);

		System.out.println(" object = " + object);

		object.add("FIVE", object2);

		System.out.println(" object = " + object);

		// JSONObject json = new JSONObject(data);
		/*
		 * JsonParser parser = new JsonParser(); JsonElement element =
		 * parser.parse(data);
		 */

		// JsonObject object = element.getAsJsonObject();

		// JsonObject 선언

		JsonObject jsonObject = new JsonObject();

		// 한번 더 감싸서 이름을 넣어주기위해 선언

		JsonObject jsonObjects = new JsonObject();

		// JsonArray 선언

		JsonArray jsonArray = new JsonArray();

		// Gson 선언

		// 가공한 데이터를 담아놓을 변수

		String getValue = "";

		// 테스트데이터입력

		// 위에서 선언한 jsonObject에 "name"라는 이름(별명)으로 "홍길동"의 값을 넣는다

		jsonObject.addProperty("name", "홍길동");

		// 마찬가지로 위에서 선언한 jsonObject에 "id"라는 이름(별명)으로 "asdasd"의 값을 넣는다

		jsonObject.addProperty("id", "asdasd");

		// json배열에 위에서 넣은 값들을 넣는다

		jsonArray.add(jsonObject);

		// 다른 데이터를 담기 위해 jsonObject초기화(?)

		jsonObject = new JsonObject();

		// 위 내용을 반복

		jsonObject.addProperty("name", "홍길순");

		jsonObject.addProperty("id", "zxczxc");

		jsonArray.add(jsonObject);

		jsonObject = new JsonObject();

		jsonObject.addProperty("name", "홍길자");

		jsonObject.addProperty("id", "qweqwe");

		jsonArray.add(jsonObject);

		jsonObject = new JsonObject();

		// 여기까지 반복

		// jsonObjects에 "user"라는 이름(별명)으로 위에서 json배열에 넣었던 값들을 넣는다

		jsonObjects.add("user", jsonArray);

		// 다른 데이터를 담기 위해 jsonArray초기화(?)

		jsonArray = new JsonArray();

		// 위에서 가공하고 jsonObjects에 담은 데이터를 Json형식으로 getValue(string)에 담는다

		getValue = gson.toJson(jsonObjects);

	}

}
