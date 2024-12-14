package dandyar.github.io;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

@Route("intro")
public class Intro extends Div {

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        H1 heading = new H1("Selamat Mengikuti Uji Kompetensi pada Skema Junior Web Programmer");
        heading.getStyle().set("margin", "2rem 0");
        heading.getStyle().set("text-align", "center");

        add(heading);
    }
}
