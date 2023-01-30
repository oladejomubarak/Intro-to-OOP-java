import dsa.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue queue;

    @BeforeEach
    public void setThis() {
        queue = new Queue(5);
    }
    @Test
    public void testThatQueueExists(){
        assertNotNull(queue);
    }
    @Test
    public void testThatQueueIsEmpty(){
        boolean response = queue.isEmpty();
        assertTrue(response);
    }
    @Test
    public void testThatQueueHasSize(){
        int available = queue.checkSize();
        assertEquals(0, available );
    }
    @Test
    public void testThatLengthCanBeSetToQueue(){
        queue.setLengthOfQueue(5);
        int length = queue.getLengthOfQueue();
        assertEquals(5, length);
    }
    @Test
    public void testThatItemCanBeAddedToQueue(){
        queue.push("bag");
        assertEquals(1, queue.checkSize());
    }
    @Test
    public void testThatItemCanBeRemoved(){
        queue.push("bag");
        queue.push("book");
        String poppedItem = queue.pop();
        assertEquals("bag", poppedItem);
        assertEquals(1, queue.checkSize());
    }
    @Test
    public void testThatItemCanBeViewed(){
    queue.push("pen");
    queue.push("shoe");
    queue.push("phone");
    String poppedItem = queue.pop();
    assertEquals("pen",poppedItem);
    String show = queue.peek();
    assertEquals("shoe", show);
    String popItem = queue.pop();
    assertEquals("shoe",popItem);
    String pt = queue.pop();
    assertEquals("phone", pt);
    String show3 = queue.peek();
    assertEquals("shoe", show3);
    }
}
