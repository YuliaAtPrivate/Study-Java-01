package dictionary;

import beans.YaDictionary;
import com.google.gson.Gson;
import com.jayway.restassured.RestAssured;
import commondata.YutaParameters;

import static dictionary.YADictionaryData.YA_DICT_KEY;
import static dictionary.YADictionaryData.YA_DICT_URL;

/**
 * Created by Yuta At on 08/05/16.
 * RestAssure requester - call Rest API
 */
public class RestAssuredRequester {

    public static YaDictionary reqOpenDictionaryClient(String lang, String word) {
        return new Gson().fromJson(RestAssured.given()
                .log().all()
                .given()
                .baseUri(YA_DICT_URL)
                .param("key", YutaParameters.getPersonalKeyByName(YA_DICT_KEY))
                .param("lang", lang)
                .param("text", word)
                .get().prettyPrint(), YaDictionary.class);
    }
}
