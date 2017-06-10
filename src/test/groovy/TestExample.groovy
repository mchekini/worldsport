import com.sm.config.DataBaseConfigTest
import com.sm.repo.EquipeRepository
import groovyx.net.http.RESTClient
import org.mockito.InjectMocks
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by Mahdi on 09/06/2017.
 */

//@ContextConfiguration(classes = DataBaseConfigTest.class)
class TestExample extends Specification {


    RESTClient client



    void setup() {
        client = new RESTClient("http://localhost:8080")
        client.handler.failure = { resp, data ->
            resp.data = data
            resp
        }

    }


    def 'it should return the square of a number'() {
        given:
        def a = 5
        when:
        def b = a * a
        then:
        verifyAll {
            b == 25
        }
    }

    def 'resources test'() {
        when:
        def resp = client.get(path: '/')
        then:
        resp.status == 200
    }



}
