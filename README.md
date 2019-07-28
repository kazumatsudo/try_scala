## やること

```
$ export COMPOSE_FILE=docker-compose.development.yml
```

## 実行

```                         
// 開始
$ docker-compose up

// sbt 実行(docker-compose up している必要がある)
$ docker-compose exec scala-sbt bash -c "cd /usr/app/ && sbt"  
```

## 備考

- staging の環境変数は ECS などで定義
    - github に載せない

## 環境構築

- Docker
```
$ docker-compose up --build
```

## ビルドツール

- [sbt](https://www.scala-sbt.org/)

## Lint

- [scalafix](https://github.com/scalacenter/scalafix/)

## テスト

- [ScalaTest](http://www.scalatest.org/)
- [JUnit 5](https://junit.org/junit5/)
- [mockito](https://site.mockito.org/)

## web フレームワーク

- [play](https://www.playframework.com/)

## ORM

- [slick](http://slick.lightbend.com/)

## 読み物
                                                                                           
- [Introduction · Scala研修テキスト - dwango on GitHub](https://dwango.github.io/scala_text/)
- [Effective Scala](https://twitter.github.io/effectivescala/index-ja.html)

## Tips

- [-Xlint, -Xfatal-warnings, そして Scalafix を用いた Scala の厳格化](http://eed3si9n.com/ja/stricter-scala-with-xlint-xfatal-warnings-and-scalafix/)

## その他

- [scalacenter](https://scala.epfl.ch/)