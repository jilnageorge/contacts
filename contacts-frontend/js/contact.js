    
    function save(){

        let xhr = new XMLHttpRequest();
        xhr.open("POST", "http://localhost:8080/contacts");

        xhr.setRequestHeader("Accept", "application/json");
        xhr.setRequestHeader("Content-Type", "application/json");

        let address = {address1: document.getElementById('address1').value,
        address2: document.getElementById('address2').value,
        city: document.getElementById('city').value,
        postCode: document.getElementById('postCode').value
        };

        let children = [{
          name: document.getElementById('name').value,
          age: document.getElementById('age').value
        }];

        let contact = {firstName: document.getElementById('firstName').value,
        lastName: document.getElementById('lastName').value,
        email: document.getElementById('email').value,
        address,
        children
        };

        let data1 = JSON.stringify(contact);
        xhr.send(data1);

        xhr.onload = () => {document.getElementById('message').innerHTML = 'Contact details saved successfully.';
        document.getElementById("message").className = "alert alert-success";}
     
    };

    function reset(){
      document.getElementById('firstName').value = '';
      document.getElementById('lastName').value = '';
      document.getElementById('email').value = '';
      document.getElementById('address1').value = '';
      document.getElementById('address2').value = '';
      document.getElementById('city').value = '';
      document.getElementById('postCode').value = '';
      document.getElementById('name').value = '';
      document.getElementById('age').value = ''; 
      document.getElementById('message').innerHTML = '';
      document.getElementById("message").className = "";
    }