import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription,format) ;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime hoje = LocalDateTime.now();
        return appointmentDate.isBefore(hoje);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hora = appointmentDate.getHour();
        return hora >= 12 && hora < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        
        String diaSemana = appointmentDate.getDayOfWeek().toString();
        diaSemana = diaSemana.substring(0, 1).toUpperCase() + 
                    diaSemana.substring(1).toLowerCase();
        
        String mes = appointmentDate.getMonth().toString();
        mes = mes.substring(0, 1).toUpperCase() + 
              mes.substring(1).toLowerCase();
        
        int dia = appointmentDate.getDayOfMonth();
        
        int ano = appointmentDate.getYear();
        
        int hora = appointmentDate.getHour();
        int minuto = appointmentDate.getMinute();
        
        String periodo = (hora >= 12) ? "PM" : "AM";
        int hora12 = hora % 12;
        if (hora12 == 0) {
            hora12 = 12;
        }
        
        String horaFormatada = String.format("%d:%02d %s", hora12, minuto, periodo);
        
        return "You have an appointment on " + diaSemana + ", " + 
               mes + " " + dia + ", " + ano + ", at " + horaFormatada + ".";
    }

    public LocalDate getAnniversaryDate() {
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        return LocalDate.of(anoAtual, 9, 15);
    }
}
