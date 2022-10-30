import com.sikadali.conwaysuite.ConwaySuite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ConwaySuiteShould {
    private ConwaySuite conwaySuite;

    @BeforeEach
    public void initialize() {
        conwaySuite = new ConwaySuite();
    }

    @Test
    public void have_1_as_the_first_term() {
        List<String> lines = conwaySuite.getLines();

        assertThat(lines.size()).isEqualTo(1);
        assertThat(lines.get(0)).isEqualTo("1");
    }

    @Test
    public void compute_the_next_line() {
        assertThat(conwaySuite.generateNext("1")).isEqualTo("1 1");
        assertThat(conwaySuite.generateNext("2")).isEqualTo("1 2");
        assertThat(conwaySuite.generateNext("1 1")).isEqualTo("2 1");
        assertThat(conwaySuite.generateNext("2 1")).isEqualTo("1 2 1 1");
        assertThat(conwaySuite.generateNext("1 1 2")).isEqualTo("2 1 1 2");
    }
}
