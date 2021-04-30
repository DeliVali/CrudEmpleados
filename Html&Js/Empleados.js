var mensaje
//Envelope de agregar Empleados
function AgregarEmpIni(){

    mensaje=
'<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
    '<Body>'+ 
        '<AgregarEmpRequest xmlns="http://tell.me/empleados">' +
            '<nombre>'+document.getElementById('Nombre').value+'</nombre>'+ 
            '<puesto>'+document.getElementById('Puesto').value+'</puesto>' +
            '<horasTrabajo>'+document.getElementById('HorasTrabajo').value+'</horasTrabajo>'+
            '<salario>'+document.getElementById('Salario').value+'</salario>'  +
        '</AgregarEmpRequest>'+
    '</Body>'+  
'</Envelope>'

}

//Agregar Empleados
function agregarEmp(){
    AgregarEmpIni()
    axios.post('http://localhost:8080//ws/empleados.wsdl', mensaje,{
        headers:{
            'Content-Type' : 'text/xml'
        }
    })
    .then(function (response){
        alert(agregarEmpResp(response.data))

    })
    .catch(err => console.log(err));
}



//Respuesta Agregar Empleados
function agregarEmpResp(rXml){
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml,"text/xml");
    var mat1 = xmlDoc.getElementsByTagName("ns2:respuesta")[0].childNodes[0].nodeValue;
    return mat1;
}



//Envelope de eliminar Empleados
function EliminarEmpIni(){

    mensaje=
'<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">'+
    '<Body>'+
        '<EliminarEmpRequest xmlns="http://tell.me/empleados">'+
            '<id>'+document.getElementById('Id').value+'</id>'+
        '</EliminarEmpRequest>'+
    '</Body>'+
'</Envelope>'

}


//Eliminar Empleados
function eliminarEmp(){
    EliminarEmpIni()
    axios.post('http://localhost:8080//ws/empleados.wsdl', mensaje,{
        headers:{
            'Content-Type' : 'text/xml'
        }
    })
    .then(function (response){
        alert(eliminarEmpResp(response.data))

    })
    .catch(err => console.log(err));
}



// Respuesta Eliminar Empleados
function eliminarEmpResp(rXml){
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml,"text/xml");
    var mat1 = xmlDoc.getElementsByTagName("ns2:respuesta")[0].childNodes[0].nodeValue;
    return mat1;
}





//Envelope de editar Empleados
function EditarEmpIni(){
    mensaje=
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">'+
    '<Body>' +
        '<EditarEmpRequest xmlns="http://tell.me/empleados">'+
            '<id>'+document.getElementById('Id').value+'</id>'+
            '<nombre>'+document.getElementById('Nombre').value+'</nombre>'+
            '<puesto>'+document.getElementById('Puesto').value+'</puesto>'+ 
            '<horasTrabajo>'+document.getElementById('HorasTrabajo').value+'</horasTrabajo>'+
            '<Salario>'+document.getElementById('Salario').value+'</Salario>'+
        '</EditarEmpRequest>'+
    '</Body>'+
'</Envelope>'

}





//Editar Empleados
function editarEmp(){
    EditarEmpIni()
    axios.post('http://localhost:8080//ws/empleados.wsdl', mensaje,{
        headers:{
            'Content-Type' : 'text/xml'
        }
    })
    .then(function (response){
        alert(editarEmpResp(response.data))

    })
    .catch(err => console.log(err));
}




// Respuesta Editar Empleados
function editarEmpResp(rXml){
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml,"text/xml");
    var mat1 = xmlDoc.getElementsByTagName("ns2:respuesta")[0].childNodes[0].nodeValue;
    return mat1;
}


//Envelope Mostrar Empleado
function MostrarEmpIni(){
    mensaje=
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">'+
    '<Body>'+
        '<MostrarEmpRequest xmlns="http://tell.me/empleados">'+
            '<id>'+document.getElementById('Id').value+'</id>'+
        '</MostrarEmpRequest>'+
    '</Body>'+
'</Envelope>'

}


//Mostrar empleados
function mostrarEmp(){
    MostrarEmpIni()
    axios.post('http://localhost:8080//ws/empleados.wsdl', mensaje,{
        headers:{
            'Content-Type' : 'text/xml'
        }
    })
    .then(function (response){

      


        console.log(mostrarEmpResp(response.data))

    })
    .catch(err => console.log(err));
}


// Respuesta Mostrar Empleados
function mostrarEmpResp(rXml){
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml,"text/xml");
    var data= [
     xmlDoc.getElementsByTagName("ns2:nombre")[0].childNodes[0].nodeValue,
     xmlDoc.getElementsByTagName("ns2:puesto")[0].childNodes[0].nodeValue,
     xmlDoc.getElementsByTagName("ns2:horasTrabajo")[0].childNodes[0].nodeValue,
     xmlDoc.getElementsByTagName("ns2:Salario")[0].childNodes[0].nodeValue]
     JSON.stringify(data);

    return data
}


