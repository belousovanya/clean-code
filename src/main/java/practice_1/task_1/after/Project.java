package practice_1.task_1.after;

class Project {
    private TaskRepository taskRepository;
    private UserRepository userRepository;

    public Project(UserRepository userRepository, TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    public void addTask(Task task) {
        taskRepository.addTask(task);
    }

    public void assignTaskToUser(String title, String username) {
        Task task = taskRepository.findTask(title);
        task.setUser(userRepository.findUser(username));
        System.out.println("Task " + title + " was assign to " + username);
    }

    public void completeTask(String title) {
        Task task = taskRepository.findTask(title);
        task.setCompleted(true);
        System.out.println("Task " + title + " was completed");
    }
}