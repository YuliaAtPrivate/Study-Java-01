package dictionary;

import commondata.YutaParameters;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.apache.commons.lang3.StringUtils.split;

/**
 * Created by Yuta-At on 16/05/16.
 * call Yandex Dictionary open API.
 */
public class YADictionaryData {
    public static final String YA_DICT_DEF_LANG = "en-en";
    public static final String YA_DICT_URL = "https://dictionary.yandex.net/api/v1/dicservice.json/lookup";
    public static final String YA_DICT_KEY = "YANDEX_DICTIONARY";


}
