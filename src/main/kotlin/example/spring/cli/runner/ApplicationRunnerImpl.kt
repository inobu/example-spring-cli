package example.spring.cli.runner

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ApplicationRunnerImpl : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        println("値を入力してください")

        //対話開始
        val line = readLine()
        repeat((1..10).count()) {
            println(line)
        }

        //コマンド値とか取れるはず
        args?.sourceArgs
    }
}