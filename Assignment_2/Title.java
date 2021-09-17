/**
 * Class for the title of something e.g a book or movie.
 * @author Ben Murphy (ID: 119394463)
 */
public class Title implements Name {
    private final String m_t;
    private final String s_t;

    public Title(final String m_t, final String s_t) {
        this.m_t = m_t;
        this.s_t = s_t;
    }
    public Title(final String m_t) {
        this.m_t = m_t;
        this.s_t = "";
    }

    @Override
    public String getName() {
        String result = "";
        result += m_t;
        if (s_t == "") {
            return result;
        } else {
            result += " / " + s_t;
            return result;
        }

    }
}
