import com.sikadali.conwaysuite.Console;
import com.sikadali.conwaysuite.ConwaySuite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.DoubleStream;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class FeatureTest {
    @Mock Console console;
    private ConwaySuite conwaySuite;

    @BeforeEach
    public void initialize() {
        conwaySuite = new ConwaySuite(console);
    }

    @Test
    public void print_n_first_lines_of_the_Conway_sequence () {
        conwaySuite.printSequence(10);

        InOrder inOrder = Mockito.inOrder(console);
        inOrder.verify(console).printLine("1");
        inOrder.verify(console).printLine("1 1");
        inOrder.verify(console).printLine("2 1");
        inOrder.verify(console).printLine("1 2 1 1");
        inOrder.verify(console).printLine("1 1 1 2 2 1");
        inOrder.verify(console).printLine("3 1 2 2 1 1");
        inOrder.verify(console).printLine("1 3 1 1 2 2 2 1");
        inOrder.verify(console).printLine("1 1 1 3 2 1 3 2 1 1");
        inOrder.verify(console).printLine("3 1 1 3 1 2 1 1 1 3 1 2 2 1");
        inOrder.verify(console).printLine("1 3 2 1 1 3 1 1 1 2 3 1 1 3 1 1 2 2 1 1");
    }
}
