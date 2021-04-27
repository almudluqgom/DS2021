import 'package:flutter/material.dart';
import 'package:flutter_ds_p2/Lista.dart';


void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Lista de compras',
      theme: ThemeData(primarySwatch: Colors.blue,),
      home: Home(),
      );
  }
}

class Home extends StatelessWidget{
  const Home({
    Key key,
})  : super(key: key);

  @override
  Widget build(BuildContext context){

    TextEditingController _producto = TextEditingController(text: "");

    return Scaffold(
      appBar: AppBar(
        title: Text('Lista de compra'),
      ),
      body: Column(
        children: [
          Container(
              padding: EdgeInsets.all(20),
              child: TextField(
                controller: _producto,

                decoration: InputDecoration(
                  hintText: 'Añadir producto'
                ),
          )),

          RaisedButton(onPressed: (){
            Navigator.push(context, MaterialPageRoute(builder: (context) => Lista(_producto.text)));
          },
            child: Text('Guardar'),
          )
        ],
      ),
    );
  }
}

