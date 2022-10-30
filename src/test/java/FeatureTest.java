import com.sikadali.conwaysuite.Console;
import com.sikadali.conwaysuite.ConwaySuite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.stream.DoubleStream;

import static org.mockito.Mockito.verify;

public class FeatureTest {
    @Mock Console console;
    private ConwaySuite conwaySuite;

    @BeforeEach
    public void initialize() {
        conwaySuite = new ConwaySuite();
        console = new Console();
    }

    @Test
    public void print_n_first_lines_of_the_Conway_sequence () {
        conwaySuite.generate(10);

        verify(console).printLine("1");
        verify(console).printLine("11");
        verify(console).printLine("21");
        verify(console).printLine("1211");
        verify(console).printLine("111221");
        verify(console).printLine("312211");
        verify(console).printLine("13112221");
        verify(console).printLine("1113213211");
        verify(console).printLine("31131211131221");
        verify(console).printLine("13211311123113112211");
    }
}
