import { Typography, Button, Col, Row, Input } from 'antd';
import { useState } from 'react';
import './App.css';

const { Title } = Typography;



function App() {
  const [todo, setTodo] = useState("Lorem ipsum dolor sit amet consectetur adipisicing elit. Rem soluta neque laborum, itaque amet cupiditate nam tempore aut doloribus placeat dolorum adipisci, numquam fugit ullam error obcaecati sit sapiente. Sunt!");
  const [todoList, setList] = useState<string[]>([]);

  const addTodo = () => {
    setList([...todoList, todo]);
    debugger
    setTodo("");
  }

  return (
    <div className="App">
      <Row>
        <Col span={16}>
          {todoList.map((imputText) => {
            return <Title level={3} >
              <span className="Bullet">◉ </span>
              {imputText}
            </Title>
          })}
        </Col>
        <Col>
          <Row>
            <Col>
              <Input
                placeholder="Digite tarefa"
                allowClear={true}
                value={todo}
                onChange={(event) => {
                  setTodo(event.target.value)
                }}
              />
            </Col>
            <Col>
              <Button type="primary" onClick={addTodo}>Button</Button>
            </Col>
          </Row>
        </Col>
      </Row>
    </div>
  );
}

export default App;
