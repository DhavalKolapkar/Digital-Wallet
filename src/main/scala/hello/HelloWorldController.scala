	package hello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
@RestController
class HelloWorldController {
@RequestMapping(Array("/"))
def helloWorld() : String = {
return "Hello World"
    }

}