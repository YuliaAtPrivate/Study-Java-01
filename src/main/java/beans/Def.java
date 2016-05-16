
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
public class Def {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("pos")
    @Expose
    private String pos;
    @SerializedName("tr")
    @Expose
    private List<Tr> tr = new ArrayList<Tr>();

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The pos
     */
    public String getPos() {
        return pos;
    }

    /**
     * 
     * @param pos
     *     The pos
     */
    public void setPos(String pos) {
        this.pos = pos;
    }

    /**
     * 
     * @return
     *     The tr
     */
    public List<Tr> getTr() {
        return tr;
    }

    /**
     * 
     * @param tr
     *     The tr
     */
    public void setTr(List<Tr> tr) {
        this.tr = tr;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(text).append(pos).append(tr).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Def) == false) {
            return false;
        }
        Def rhs = ((Def) other);
        return new EqualsBuilder().append(text, rhs.text).append(pos, rhs.pos).append(tr, rhs.tr).isEquals();
    }

}
