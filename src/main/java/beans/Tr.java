
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
public class Tr {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("pos")
    @Expose
    private String pos;
    @SerializedName("syn")
    @Expose
    private List<Syn> syn = new ArrayList<Syn>();
    @SerializedName("mean")
    @Expose
    private List<Mean> mean = new ArrayList<Mean>();
    @SerializedName("ex")
    @Expose
    private List<Ex> ex = new ArrayList<Ex>();

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
     *     The syn
     */
    public List<Syn> getSyn() {
        return syn;
    }

    /**
     * 
     * @param syn
     *     The syn
     */
    public void setSyn(List<Syn> syn) {
        this.syn = syn;
    }

    /**
     * 
     * @return
     *     The mean
     */
    public List<Mean> getMean() {
        return mean;
    }

    /**
     * 
     * @param mean
     *     The mean
     */
    public void setMean(List<Mean> mean) {
        this.mean = mean;
    }

    /**
     * 
     * @return
     *     The ex
     */
    public List<Ex> getEx() {
        return ex;
    }

    /**
     * 
     * @param ex
     *     The ex
     */
    public void setEx(List<Ex> ex) {
        this.ex = ex;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(text).append(pos).append(syn).append(mean).append(ex).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tr) == false) {
            return false;
        }
        Tr rhs = ((Tr) other);
        return new EqualsBuilder().append(text, rhs.text).append(pos, rhs.pos).append(syn, rhs.syn).append(mean, rhs.mean).append(ex, rhs.ex).isEquals();
    }

}
