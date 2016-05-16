
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class YaDictionary {

    @SerializedName("dict")
    @Expose
    private Dict dict;
    @SerializedName("def")
    @Expose
    private List<Def> def = new ArrayList<Def>();

    /**
     * 
     * @return
     *     The dict
     */
    public Dict getDict() {
        return dict;
    }

    /**
     * 
     * @param dict
     *     The dict
     */
    public void setDict(Dict dict) {
        this.dict = dict;
    }

    /**
     * 
     * @return
     *     The def
     */
    public List<Def> getDef() {
        return def;
    }

    /**
     * 
     * @param def
     *     The def
     */
    public void setDef(List<Def> def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dict).append(def).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof YaDictionary) == false) {
            return false;
        }
        YaDictionary rhs = ((YaDictionary) other);
        return new EqualsBuilder().append(dict, rhs.dict).append(def, rhs.def).isEquals();
    }

}
