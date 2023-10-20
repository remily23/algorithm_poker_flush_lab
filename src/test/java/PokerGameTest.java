import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokerGameTest {

        private PokerGame poker;

        @BeforeEach
        public void before(){
            poker = new PokerGame();
        }

        @Test
        public void checkIfFlushSimpleHand__true(){
            String[] cards = {"AH", "7H", "JH", "2H", "9H"};
            assertTrue(poker.checkIfFlush(cards));
        }

        @Test
        public void checkIfFlushSimpleHand__false(){
            String[] cards = {"2D", "7H", "JC", "2H", "KD"};
            assertFalse(poker.checkIfFlush(cards));
        }

        @Test
        public void checkIfFlush__true(){
            String[] cards = {"10H", "7H", "JH", "5H", "KH"};
            assertTrue(poker.checkIfFlush(cards));
        }

        @Test
        public void checkIfFlush__false(){
            String[] cards = {"2D", "7H", "JC", "10H", "KS"};
            assertFalse(poker.checkIfFlush(cards));
        }

}
