package uk.co.kleindelao.demo.wicket.springboot.label

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage
import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.markup.html.basic.Label

@WicketHomePage
class HomePage : WebPage() {
    init {
        add(Label("helloMessage", "Hello WicketWorld!"))
    }
}