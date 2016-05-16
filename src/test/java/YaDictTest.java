import beans.YaDictionary;
import dictionary.RestAssuredRequester;
import org.junit.Test;

import static dictionary.YADictionaryData.YA_DICT_DEF_LANG;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by Yuta-At on 07/05/16.
 * Tests for Yandex Dictionary API
 */
public class YaDictTest {


    @Test
    public void getDictRespForHome() {
        RestAssuredRequester.reqOpenDictionaryClient(YA_DICT_DEF_LANG, "home");
    }

}
