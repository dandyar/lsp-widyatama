package dandyar.github.io;

import com.vaadin.cdi.annotation.CdiComponent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import jakarta.annotation.PostConstruct;


/**
 * Vaadin Flow adalah UI Framework untuk membuat aplikasi web menggunakan Java.
 * Baca lebih lanjut tentang Vaadin <a href="https://vaadin.com">https://vaadin.com</a>
 */
@Route("")
@CdiComponent
public class WebApplication extends Div {

    @PostConstruct
    public void init() {

        // Menambahkan CSS inline untuk form input data
        getStyle().set("width", "100%");
        getStyle().set("max-width", "600px");
        getStyle().set("margin-left", "auto");
        getStyle().set("margin-right", "auto");
        getStyle().set("padding-top", "1.25rem");

        // Membuat judul form
        H2 heading = new H2("Input Biodata");
        heading.getStyle().set("text-align", "center");
        heading.getStyle().set("text-decoration", "underline");
        heading.getStyle().set("margin-bottom", "1rem");

        // Atur layout form input biodata
        FormLayout formLayout = new FormLayout();
        formLayout.setResponsiveSteps(
                new FormLayout.ResponsiveStep("0", 1, FormLayout.ResponsiveStep.LabelsPosition.ASIDE)
        );

        // Buat komponen yang akan ditampilkan di form input data
        TextField nikField = new TextField();
        nikField.setWidthFull();
        TextField namaField = new TextField();
        namaField.setWidthFull();
        TextField tempatLahir = new TextField();
        tempatLahir.setWidthFull();
        TextField tanggalLahir = new TextField();
        tanggalLahir.setWidthFull();
        TextField jenisKelamin = new TextField();
        jenisKelamin.setWidthFull();
        TextField alamat = new TextField();
        alamat.setWidthFull();
        Select<String> agamaSelect = new Select<>();
        agamaSelect.setWidthFull();
        agamaSelect.setItems("Islam", "Kristen", "Katolik", "Hindu", "Budha", "Konghucu");

        // Menambahkan label untuk setiap komponen form input data
        formLayout.addFormItem(nikField, "NIK");
        formLayout.addFormItem(namaField, "Nama");
        formLayout.addFormItem(tempatLahir, "Tempat Lahir");
        formLayout.addFormItem(tanggalLahir, "Tanggal Lahir");
        formLayout.addFormItem(jenisKelamin, "Jenis Kelamin");
        formLayout.addFormItem(alamat, "Alamat");
        formLayout.addFormItem(agamaSelect, "Agama");
        formLayout.getStyle().set("margin-bottom", "1rem");

        // Atur posisi tombol Send dan Cancel
        Button sendButton = new Button("Send");
        sendButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        Button cancelButton = new Button("Cancel");
        FlexLayout buttonLayout = new FlexLayout(sendButton, cancelButton);
        buttonLayout.setJustifyContentMode(FlexLayout.JustifyContentMode.CENTER);
        buttonLayout.getStyle().set("gap", "1rem");


        // Tampilkan komponen ke browser
        add(heading, formLayout, buttonLayout);
    }
}
