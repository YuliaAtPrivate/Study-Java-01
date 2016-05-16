package commondata;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.split;

/**
 * Created by Yuta-At on 16/05/16.
 * Common parameters used in different projects.
 */
public class YutaParameters {
    private static final String KEY_FILE_PATH = "/Users/jatlasova/git/Study/yuta_keys.txt";

    public static String getPersonalKeyByName(String keyName) {
        try {
            List<String> keyLines = Files.readAllLines(FileSystems.getDefault().getPath(KEY_FILE_PATH));

            for (String key : keyLines) {
                if (key.toLowerCase().contains(keyName.toLowerCase())) {
                    return split(key, "=")[1];
                }
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
