package dev.stratospheric.todoapp.collaboration;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/testTodo")
@Profile("dev")
public class TestTodoController {

  private final TodoTestCollaborationService todoTestCollaborationService;

  public TestTodoController(
    TodoTestCollaborationService todoTestCollaborationService
  ) {
    this.todoTestCollaborationService = todoTestCollaborationService;
  }

  @GetMapping("/confirmCollaboration")
  @ResponseBody
  public String confirmCollaboration() {
    String message = todoTestCollaborationService.testConfirmCollaboration();

    return "Done: " + message;
  }
}
