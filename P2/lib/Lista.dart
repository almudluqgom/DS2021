import 'package:flutter/material.dart';

class Lista extends StatelessWidget{
  final String textprod;
  const Lista (this.textprod, {Key key}) : super (key: key);

  @override
  Widget build(BuildContext context) {

    kProducts.add(textprod);
    return Scaffold(
      appBar: AppBar(title: Text('Volver'),),
      body:ListView.builder(
        itemCount: kProducts.length,
        itemBuilder: (context, index) {
          return ListTile(
            title: Text(kProducts[index]),
          );
        },
      ),
    );
  }
}

List kProducts = <String>[  ];
