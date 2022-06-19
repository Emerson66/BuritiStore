package br.com.buritiscript.userapi.controller;

import br.com.buritiscript.userapi.controller.responseDto.UserResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/")
    public String getMensagem(){
        return "Spring Boot is working!";
    }

    @GetMapping("/users")
    public List<UserResponseDto> getUsers(){

        return userResponseDtos;
    }

    @GetMapping("/users/{cpf}")
    public UserResponseDto getUsersFiltro(@PathVariable String cpf){
        for (UserResponseDto userResponseDtoFiltro: userResponseDtos){
            if (userResponseDtoFiltro.getCpf().equals(cpf)){
                return userResponseDtoFiltro;
            }
        }
        return null;
    }


    public static List<UserResponseDto> userResponseDtos = new ArrayList<UserResponseDto>();

    /*
    * @PostConstruct
    * faz com que ele seja executado logo depois que o contêiner inicializa a
    * classe UserController . Essa anotação pode ser utilizada em todas
    * as classes gerenciadas pelo Spring como Controllers e Services.
    * */
    @PostConstruct
    public void initiateList(){
        UserResponseDto userResponseDto1= new UserResponseDto();
        userResponseDto1.setNome("Emerson Reis");
        userResponseDto1.setCpf("12345678910");
        userResponseDto1.setEndereco("Av. sol");
        userResponseDto1.setEmail("emersonreisdacosta@gmail.com");
        userResponseDto1.setTelefone("95991000000");
        userResponseDto1.setDateCadastro(new Date());

        UserResponseDto userResponseDto2 = new UserResponseDto();
        userResponseDto2.setNome("Tioro");
        userResponseDto2.setCpf("12378945611");
        userResponseDto2.setEndereco("Av. osl");
        userResponseDto2.setEmail("tioro@gmail.com");
        userResponseDto2.setTelefone("95991000002");
        userResponseDto2.setDateCadastro(new Date());

        UserResponseDto userResponseDto3 = new UserResponseDto();
        userResponseDto3.setNome("Nosreme Sier");
        userResponseDto3.setCpf("10987654321");
        userResponseDto3.setEndereco("Av. los");
        userResponseDto3.setEmail("nosreme@gmail.com");
        userResponseDto3.setTelefone("95991000001");
        userResponseDto3.setDateCadastro(new Date());

        userResponseDtos.add(userResponseDto1);
        userResponseDtos.add(userResponseDto2);
        userResponseDtos.add(userResponseDto3);
    }
}
