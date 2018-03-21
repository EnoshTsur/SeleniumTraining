$(document).ready(() => {

    // !------------------Start rendering-----------------!
    // fade in number
    var fn = 1000;

    $('.all-tasks').hide();
    $('.done-tasks').hide();



    // !-------------------Navigation----------------------!


    // About me
    $('#about').click(() => {
        swal('Hello!' , 'Im Enosh Tsur & i have a dog named Cashew!');
    });
    // All tasks
    $('#all-tasks').click(() => {
        getAllTasks();
        var index = $('#done-input').val(1234);
        var index = $('#remove-input').val(1234);



        // Navigation bar
        $('.todo').fadeOut(fn);
        $('.done-tasks').fadeOut(fn);
        $('.all-tasks').show(fn);
    });

    // Done tasks
    $('#done-tasks').click(() => {
        $('.done-text').text('');
        missions.forEach(element => {
            if (element.done) {
                $('.done-text').append(element.number + ' ' + element.message + '<br>');
            }
        })
        $('.done-tasks').show();
        $('.todo').fadeOut(fn);
        $('.all-tasks').fadeOut(fn);
    });

    // Todo tasks
    $('#todo-task').click(() => {
        $('.todo').fadeIn(fn);
        $('.all-tasks').fadeOut(fn);
        $('.done-tasks').fadeOut(fn);
    });

    // !-------------------Navigation----------------------!


    // !-------------------Inside functions----------------!

    // Sending to do
    $('#send-task').click(() => {
        var txt = $('#todo').val();
       
        if(txt == 0)
        {
            swal('Error' , 'You can not send blank value' , 'warning');
            return;
        }
        missions.push(new Mission($('#todo').val(), number));
        swal('Great!' , 'you added new task' , 'success');
        $('#todo').val('');
        number = missions.length;
    });

    //click to add
    $('.btn').click(() => {
        var successDone = false;
        var index = $('#done-input').val();
        missions.forEach(element => {
            if (element.number == index) {
                element.done = true;
                successDone = true;
            }
        });
        if(successDone){
            swal('Done!' , 'Your task been done!' , 'success');
        }else{
            swal('Error' , "ID was not found in the Task's list" , 'warning');
        }
        successDone = false;
    });


    

    // click to remove
    $('.btn2').click(() => {
        var successRemove = false;
        var index = $('#remove-input').val();
        missions.forEach(element => {
            if (element.number == index) {
                delete missions[index];
                getAllTasks();
                number = missions.length;
                successRemove = true;

            }
        });
        
        if(successRemove){
            swal('Removing' , 'Your task has removed' , 'success');
        }else{
            swal('Error' , "ID was not found in the Task's list" , 'warning');
        }
        successRemove =false;
    });

    function getAllTasks() {
        // removing last text
        $('#tasks').text('');
        // initail the new one
        missions.forEach(element => {
            $('#tasks').append('ID: ' + element.number + '    Task: ' + element.message + " <br>");
        });
    }
    // !-------------------Inside functions----------------!
});