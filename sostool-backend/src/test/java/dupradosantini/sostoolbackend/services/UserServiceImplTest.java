package dupradosantini.sostoolbackend.controllers;

import dupradosantini.sostoolbackend.domain.AppUser;
import dupradosantini.sostoolbackend.domain.Team;
import dupradosantini.sostoolbackend.domain.Workspace;
import dupradosantini.sostoolbackend.services.WorkspaceServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.junit.jupiter.api.Assertions.*;

class WorkspaceControllerTest {

    @Test
    void UserHasRoleInWorkspace(){
    	AppUser user = new AppUser();
    	Workspace workspace = new Workspace();
    	
    	boolean receivedReturn = UserHasRoleInWorkspace(user, workspace);
    	
    	assertNotNull(receivedReturn);
    }
}