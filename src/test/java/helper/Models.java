package helper;

import groovyjarjarantlr4.v4.codegen.model.SrcOp;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import java.sql.Struct;

import static helper.Utility.generateRandomEmail;

public class Models {
    private static RequestSpecification request;

    public static void  setupHeaders(){
        request = RestAssured.given()
                .headers("Content-Type", "application/json")
                .headers("Accept", "application/json")
                .headers("Authorization", "Bearer c7d16167cab3d86d719d518b30dfefddd3b1c8a18d5934c8f70018ddebe9d2a9");
    }

    public static Response getListUsers (String endpoint){
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response postCreateUser(String endpoint){
        String name = "Akbar Ilham";
        String gender = "male";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }

    public static Response deleteUser(String endpoint, String user_id){
        setupHeaders();
        String finalEndpoint = endpoint + "/" + user_id;
        return request.when().delete(finalEndpoint);
    }

    public static Response updateUser(String endpoint, String user_id){
        setupHeaders();

        String name = "Akbar part2";
        String gender = "male";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);


        String finalEndpoint = endpoint + "/" + user_id;
        return request.body(payload.toString()).when().patch(finalEndpoint);
    }


}
