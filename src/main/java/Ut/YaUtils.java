package Ut;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Yuta-At on 08/05/16.
 * just to reduce time - some utils
 */
public abstract class YaUtils {

  private static final Logger logger = Logger.getLogger(YaUtils.class.getName());

    public static void logInfo(Object o){

        logger.info(o.toString());

    }

}
