# 🚀 Final Project Practice

파이널 프로젝트를 시작하기 전에 **Git/GitHub 협업 과정을 미리 연습하고, 프로젝트에 필요한 기본 개념을 함께 공부하기 위한 Repository**입니다.

실제 파이널 프로젝트에 들어가기 전,

- Git Branch를 활용한 작업
- Commit / Pull / Push
- Pull Request
- Code Review
- Merge
- Conflict 해결

등의 협업 과정을 직접 경험하는 것을 목표로 합니다.

Git 사용 방법과 협업 규칙에 대한 자세한 내용은 [`GIT_USAGE.md`](./GIT_USAGE.md)를 참고합니다.

---

## 📚 Study

Git 연습과 함께 파이널 프로젝트에서 활용할 아래 두 가지 주제를 각자 공부합니다.

### 1. REST API

각자 REST API에 대해 공부한 내용을 Markdown으로 정리합니다.

최소한 아래 내용을 포함하여 작성합니다.

- REST란?
- API란?
- REST API란?
- REST를 사용하는 이유
- HTTP Method
  - GET
  - POST
  - PUT
  - PATCH
  - DELETE
- 주요 HTTP Status Code
- REST API URL 설계 방법
- RESTful API란?

---

### 2. Exception Handling

각자 Java와 Spring에서 사용하는 예외처리 방식에 대해 공부한 내용을 Markdown으로 정리합니다.

최소한 아래 내용을 포함하여 작성합니다.

- Exception이란?
- 예외처리가 필요한 이유
- Checked Exception / Unchecked Exception
- `try-catch`
- Custom Exception
- Global Exception Handler
- API Error Response

---

# 📁 Repository 구조

각자 공부한 내용은 아래와 같은 구조로 작성합니다.

```text
final-project-practice
│
├── README.md
├── GIT_USAGE.md
│
└── docs
    │
    ├── rest-api
    │   ├── REST_API_ilhyeon.md
    │   ├── REST_API_gildong.md
    │   └── ...
    │
    └── exception
        ├── EXCEPTION_ilhyeon.md
        ├── EXCEPTION_gildong.md
        └── ...
```

---

# ✏️ 작성 방법

## REST API

`docs/rest-api` 폴더에 본인의 Markdown 파일을 생성합니다.

```text
docs/rest-api/REST_API_이름.md
```

예시

```text
docs/rest-api/REST_API_ilhyun.md
```

---

## Exception Handling

`docs/exception` 폴더에 본인의 Markdown 파일을 생성합니다.

```text
docs/exception/EXCEPTION_이름.md
```

예시

```text
docs/exception/EXCEPTION_ilhyun.md
```

---

# 🔄 진행 방법

각자의 문서는 **GitHub에서 직접 작성하지 않고 Local Repository에서 작성**합니다.

전체적인 진행 과정은 다음과 같습니다.

```text
Repository Clone
      ↓
개인 작업 Branch 생성
      ↓
REST API 와 Exception Handling 공부
      ↓
.md 파일 작성
      ↓
Commit
      ↓
Pull / Push
      ↓
Pull Request 작성
      ↓
다른 팀원의 문서 확인 및 Review
      ↓
Merge
```

자세한 Git 명령어와 Branch 전략, Commit Message 및 Pull Request 규칙은 [`GIT_USAGE.md`](./GIT_USAGE.md)를 참고합니다.

---

# 💬 학습 내용 공유

각자가 같은 주제를 공부하더라도 이해한 내용이나 중요하게 생각한 부분은 다를 수 있습니다.

Pull Request가 올라오면 다른 팀원의 문서를 읽어보고

- 내가 몰랐던 내용
- 다르게 이해하고 있던 내용
- 추가하면 좋을 내용
- 잘못 이해한 내용
- 함께 이야기해보고 싶은 내용

등을 Review를 통해 공유합니다.

단순히 `.md` 파일을 작성하는 것이 목적이 아니라, **Git을 이용해 다른 사람의 작업을 확인하고 의견을 주고받는 과정까지 경험하는 것**을 목표로 합니다.

---

# 🎯 Repository 목표

이 Repository의 최종 목표는 크게 두 가지입니다.

### 1. Git/GitHub 협업 경험

파이널 프로젝트가 시작된 뒤 Git 사용법을 익히는 것이 아니라,

**프로젝트 시작 전 실제 협업과 비슷한 과정을 미리 경험하여 파이널 프로젝트에서는 바로 개발에 집중할 수 있도록 준비합니다.**

### 2. 공통 개발 지식 공부

REST API와 예외처리 방식을 각자 공부하고 서로의 내용을 공유하면서,

**파이널 프로젝트에 들어가기 전 팀원들의 기본적인 개발 지식과 이해도를 함께 맞춰봅니다.**

> 이번 Repository에서 사용한 Git 규칙이나 개발 방식은 연습 후 팀원들과 다시 이야기하여\
> 실제 파이널 프로젝트에 적용할 규칙을 결정합니다.
